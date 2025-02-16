#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "game.h"
#include<QIcon>
MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
    , game(nullptr)
{
    ui->setupUi(this);
    this->setWindowIcon(QIcon(":/image/r_j.png"));
    this->setWindowTitle("中国象棋");
    this->setFixedSize(650, 600);
    this->setWindowFlags(windowFlags() & ~Qt::WindowMaximizeButtonHint);

    game = new Game(this);
}

MainWindow::~MainWindow()
{
    delete game;
    delete ui;
}
