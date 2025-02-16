#ifndef GAME_H
#define GAME_H

#include <QtWidgets/QMainWindow>
#include <QtCore/QObject>
#include <QDebug>
#include "board.h"
#include "stone.h"
#include "utils.h"

class Game : public QObject {
public:
    int a[9][10];
    explicit Game(QMainWindow* parent = nullptr);
    virtual ~Game();
    bool ifmove();
    void initstones();
private:
    Board* board;
    Stone stones[32];
    utils* util;
public slots:
    void movestone();
    void eatstone();
};

#endif // GAME_H
