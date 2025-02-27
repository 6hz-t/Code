#include "board.h"
#include <QMenuBar>
#include <QPushButton>
#include <QVBoxLayout>
#include <QHBoxLayout>
#include <QWidget>
#include <QCoreApplication>
#include <QPoint>
#include <QMouseEvent>
#include <QProcess>
#include <QLabel>

Board::Board(QWidget *parent)
    : QMainWindow{parent}
{
    QWidget* centralWidget = new QWidget(this);
    setCentralWidget(centralWidget);

    QHBoxLayout* mainLayout = new QHBoxLayout(centralWidget);

    boardWidget = new QWidget();
    boardWidget->setFixedSize(520, 570);

    QPixmap background(":/image/chessboard.png");
    QPalette palette;
    palette.setBrush(QPalette::Window, QBrush(background));
    boardWidget->setPalette(palette);
    boardWidget->setAutoFillBackground(true);


    QWidget* buttonWidget = new QWidget();
    QVBoxLayout* buttonLayout = new QVBoxLayout(buttonWidget);

    QPushButton* restartBtn = new QPushButton("重新开始", buttonWidget);
    QPushButton* undoBtn = new QPushButton("悔棋", buttonWidget);
    QPushButton* exitBtn = new QPushButton("退出", buttonWidget);


    QSize btnSize(100, 40);
    restartBtn->setFixedSize(btnSize);
    undoBtn->setFixedSize(btnSize);
    exitBtn->setFixedSize(btnSize);

    buttonLayout->addWidget(restartBtn);
    buttonLayout->addWidget(undoBtn);
    buttonLayout->addWidget(exitBtn);
    buttonLayout->addStretch();

    mainLayout->addWidget(boardWidget);
    mainLayout->addWidget(buttonWidget);

    topImageLabel = new QLabel(boardWidget);
    topImageLabel->setAlignment(Qt::AlignCenter);
    topImageLabel->setVisible(false);

    connect(exitBtn, &QPushButton::clicked, this, &Board::exitGame);
    connect(restartBtn, &QPushButton::clicked, this, &Board::restart);
    connect(undoBtn, &QPushButton::clicked, this, &Board::undo);

    selectedBox = nullptr;
    hasSelection = false;
}
void Board::showTopImage()
{
    QPixmap pixmap(":/image/gameover.png");
    if (!pixmap.isNull())
    {
        QPixmap scaledPixmap = pixmap.scaled(200, 200, Qt::KeepAspectRatio, Qt::SmoothTransformation);
        topImageLabel->setScaledContents(true);

        topImageLabel->setPixmap(scaledPixmap);
        topImageLabel->setGeometry(0, 0, 500, 500);
        topImageLabel->raise();
        topImageLabel->show();
    }
}
void Board::restart() {
    QString program = QCoreApplication::applicationFilePath();
    QProcess::startDetached(program);
    QCoreApplication::exit(0);
}

void Board::undo() {
}
void Board::exitGame() {
    QCoreApplication::exit(0);
}

void Board::mousePressEvent(QMouseEvent *event)
{
    QPoint pos = event->pos();
    this->to_col = (pos.x() - 2) / 57;
    this->to_row = (pos.y() - 2) / 57;
    emit positionClicked();
}

void Board::eat()
{
    emit eatsignal();
}
