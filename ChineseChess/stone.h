#ifndef STONE_H
#define STONE_H
#include "board.h"
#include <QtWidgets/QPushButton>
#include <QtGui/QMouseEvent>

class Stone : public QPushButton
{
    Q_OBJECT

public:
    explicit Stone(QWidget *parent = nullptr);
    int row;
    int col;
    virtual ~Stone();
    bool live = true;
    static Board* board;


    int getonid()const{return board->onid;}
    int getId() const { return id; }
    void setId(int id) { this->id = id; }
private:
    int id;
public slots:

    void oneround();

};

#endif
