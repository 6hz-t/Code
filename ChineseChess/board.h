#ifndef BOARD_H
#define BOARD_H

#include <QMainWindow>
#include <QApplication>
#include <QLabel>

class Board : public QMainWindow
{
    Q_OBJECT
public:
    int onid=-1;
    int to_row;
    int to_col;
    int eatenid=-1;
    int round=-1;//-1红 1黑
    void showTopImage();
    explicit Board(QWidget *parent = nullptr);
public slots:
    void restart();
    void undo();
    void exitGame();
    void eat();
protected:
    void mousePressEvent(QMouseEvent *event);
private:
    QWidget *boardWidget;
    QLabel *topImageLabel;
    QLabel* selectedBox;
    QPoint selectedPos;
    bool hasSelection;
signals:
    void positionClicked();
    void eatsignal();
};

#endif
