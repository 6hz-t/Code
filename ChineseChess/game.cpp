#include "game.h"
#include "board.h"
#include "stone.h"
#include "utils.h"
#include <QMainWindow>
#include <QObject>
#include <QMouseEvent>
#include <QException>

Game::Game(QMainWindow* parent):QObject(parent) {



    //棋盘初始化
    board = new Board(nullptr);
    board->setParent(parent);
    parent->setCentralWidget(board);
    connect(board, &Board::positionClicked, this, &Game::movestone);
    connect(board,&Board::eatsignal,this,&Game::eatstone);

    //棋子初始化
    {
        Stone::board = board;
        for(int i=0;i<32;i++)
        {
            stones[i].setParent(parent);
            stones[i].setFixedSize(69, 69);
            stones[i].setIconSize(QSize(69, 69));
            stones[i].setId(i);
            connect(&stones[i], &QPushButton::clicked, &stones[i], &Stone::oneround);
        }
        initstones();
    }
    //工具类
    util=new utils();

}
Game::~Game() {
}
void Game::movestone()
{
    if(board->onid!=-1)
    {
        stones[board->onid].move(2+59*board->to_col,2+59*board->to_row);
        qDebug()<<"stone"<<board->onid<<"move to "<<board->to_col<<","<<board->to_row;

        for(int i=0;i<9;i++)
            for(int j=0;j<10;j++)
            {
                if(a[i][j]==board->onid)
                {
                    a[i][j]=0;
                }
            }

        a[board->to_col][board->to_row]=board->onid;
        board->round=-board->round;
    }
    if(board->round==-1)
        qDebug()<<"黑方回合结束，红方回合开始";
    else
        qDebug()<<"红方回合结束，黑方回合开始";
    board->onid=-1;
}
void Game::eatstone()
{
    if(board->eatenid==4||board->eatenid==20)
    {
        board->showTopImage();
        qDebug() << "Game over";
    }
    try {
            for(int i=0;i<9;i++)
                for(int j=0;j<10;j++)
                {
                    if(a[i][j]==board->onid)
                    {
                    a[i][j]=0;
                    }
                }

            for(int i=0;i<9;i++)
                for(int j=0;j<10;j++)
                {
                    //qDebug() << i<<" "<<j;
                    if(a[i][j]==board->eatenid)
                    {
                        //qDebug() << i<<" "<<j;
                        board->to_col=i;
                        board->to_row=j;
                        a[i][j]=board->onid;
                        stones[board->onid].move(2+i*59,2+j*59);

                    }
                }

    } catch (QException& e) {
        qDebug() << e.what(); // 异常信息
    }
    stones[board->eatenid].hide();
    board->onid=-1;
    board->round=-board->round;
    if(board->round==-1)
        qDebug()<<"黑方回合结束，红方回合开始";
    else
        qDebug()<<"红方回合结束，黑方回合开始";
}
bool Game::ifmove()
{
    int col,row;
    util->getCRbyid(a,row,col,board->onid);
    switch (board->onid) {
    case 0:
    case 8:
    case 16:
    case 24://车
    {

        if(row==board->to_row||col==board->to_col)
            return true;
    }
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31://卒
    {
        if((row-board->to_row<=1&&row-board->to_row>=-1)&&(col-board->to_col<=1&&col-board->to_col>=-1))
            return true;
    }
    case 9:
    case 10:
    case 25:
    case 26://炮
    {
         if(row==board->to_row)
        {

        }
        else if(col==board->to_col)
        {

        }
    }
    default:
        return true;
    }

}
void Game::initstones()
{
    for(int i = 0; i < 9; i++) {
        for(int j = 0; j < 10; j++) {
            a[i][j] = -1;
        }
    }
    //balck
    a[0][0]=0;
    stones[0].setIcon(QIcon(":/image/b_c.png"));
    stones[0].col=0;stones[0].row=0;

    a[1][0]=1;
    stones[1].setIcon(QIcon(":/image/b_m.png"));
    stones[1].col=1;stones[0].row=0;

    a[2][0]=2;
    stones[2].setIcon(QIcon(":/image/b_x.png"));
    stones[2].col=2;stones[0].row=0;

    a[3][0]=3;
    stones[3].setIcon(QIcon(":/image/b_s.png"));
    stones[3].col=3;stones[0].row=0;

    a[4][0]=4;
    stones[4].setIcon(QIcon(":/image/b_j.png"));
    stones[4].col=4;stones[0].row=0;

    a[5][0]=5;
    stones[5].setIcon(QIcon(":/image/b_s.png"));
    stones[5].col=5;stones[0].row=0;

    a[6][0]=6;
    stones[6].setIcon(QIcon(":/image/b_x.png"));
    stones[6].col=6;stones[0].row=0;

    a[7][0]=7;
    stones[7].setIcon(QIcon(":/image/b_m.png"));
    stones[7].col=7;stones[0].row=0;

    a[8][0]=8;
    stones[8].setIcon(QIcon(":/image/b_c.png"));
    stones[8].col=8;stones[0].row=0;

    a[1][2]=9;
    stones[9].setIcon(QIcon(":/image/b_p.png"));
    stones[9].col=1;stones[0].row=2;

    a[7][2]=10;
    stones[10].setIcon(QIcon(":/image/b_p.png"));
    stones[10].col=7;stones[0].row=2;

    a[0][3]=11;
    stones[11].setIcon(QIcon(":/image/b_z.png"));
    stones[11].col=0;stones[0].row=3;

    a[2][3]=12;
    stones[12].setIcon(QIcon(":/image/b_z.png"));
    stones[12].col=2;stones[0].row=3;

    a[4][3]=13;
    stones[13].setIcon(QIcon(":/image/b_z.png"));
    stones[13].col=4;stones[0].row=3;

    a[6][3]=14;
    stones[14].setIcon(QIcon(":/image/b_z.png"));
    stones[14].col=6;stones[0].row=3;

    a[8][3]=15;
    stones[15].setIcon(QIcon(":/image/b_z.png"));
    stones[15].col=8;stones[0].row=3;

    //red
    a[0][9]=16;
    stones[16].setIcon(QIcon(":/image/r_c.png"));
    stones[16].col=0;stones[0].row=9;

    a[1][9]=17;
    stones[17].setIcon(QIcon(":/image/r_m.png"));
    stones[17].col=1;stones[0].row=9;

    a[2][9]=18;
    stones[18].setIcon(QIcon(":/image/r_x.png"));
    stones[18].col=2;stones[0].row=9;

    a[3][9]=19;
    stones[19].setIcon(QIcon(":/image/r_s.png"));
    stones[19].col=3;stones[0].row=9;

    a[4][9]=20;
    stones[20].setIcon(QIcon(":/image/r_j.png"));
    stones[20].col=4;stones[0].row=9;

    a[5][9]=21;
    stones[21].setIcon(QIcon(":/image/r_s.png"));
    stones[21].col=5;stones[0].row=9;

    a[6][9]=22;
    stones[22].setIcon(QIcon(":/image/r_x.png"));
    stones[22].col=6;stones[0].row=9;

    a[7][9]=23;
    stones[23].setIcon(QIcon(":/image/r_m.png"));
    stones[23].col=7;stones[0].row=9;

    a[8][9]=24;
    stones[24].setIcon(QIcon(":/image/r_c.png"));
    stones[24].col=8;stones[0].row=9;

    a[1][7]=25;
    stones[25].setIcon(QIcon(":/image/r_p.png"));
    stones[25].col=1;stones[0].row=7;

    a[7][7]=26;
    stones[26].setIcon(QIcon(":/image/r_p.png"));
    stones[26].col=7;stones[0].row=7;

    a[0][6]=27;
    stones[27].setIcon(QIcon(":/image/r_z.png"));
    stones[27].col=0;stones[0].row=6;

    a[2][6]=28;
    stones[28].setIcon(QIcon(":/image/r_z.png"));
    stones[28].col=2;stones[0].row=6;

    a[4][6]=29;
    stones[29].setIcon(QIcon(":/image/r_z.png"));
    stones[29].col=4;stones[0].row=6;

    a[6][6]=30;
    stones[30].setIcon(QIcon(":/image/r_z.png"));
    stones[30].col=6;stones[0].row=6;

    a[8][6]=31;
    stones[31].setIcon(QIcon(":/image/r_z.png"));
    stones[31].col=8;stones[0].row=6;

    for(int i=0;i<9;i++)

        for(int j=0;j<10;j++)
            if(a[i][j]!=-1)
            {
                int t=a[i][j];
                stones[t].move(2+59*i,2+59*j);
            }
    return;

}


