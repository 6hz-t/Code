#include "stone.h"
#include "board.h"
#include <QIcon>
#include <QDebug>
#include <QMouseEvent>
Board* Stone::board = nullptr;
Stone::Stone(QWidget *parent)
    : QPushButton(parent)
    , id(0)
{
    setFlat(true);
    setFixedSize(30, 30);
}
void Stone::oneround()
{

    if((board->round==1&&board->onid>-1&&board->onid<16&&this->getId()>15)||(board->round==-1&&board->onid>15&&this->getId()<16))
    {
        board->eatenid=this->getId();
        if(board->onid!=-1)
            qDebug()<<"stone"<<board->onid<<"eat"<<"stone"<<board->eatenid;
        board->eat();
        board->eatenid=-1;
    }
    else
    {
        board->onid = this->getId();
        qDebug()<<"select onid"<<board->onid;
    }






}



Stone::~Stone()
{
}
