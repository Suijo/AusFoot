package footDao.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class match_stats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String mid;
    @Column
    private int pid;
    @Column
    private int tid;
    @Column
    private String loc;
    @Column
    private int KI;
    @Column
    private int MK;
    @Column
    private int HB;
    @Column
    private int DI;
    @Column
    private int GL;
    @Column
    private int BH;
    @Column
    private int HO;
    @Column
    private int TK;
    @Column
    private int RB;
    @Column
    private int IF;
    @Column
    private int CL;
    @Column
    private int CG;
    @Column
    private int FF;
    @Column
    private int FA;
    @Column
    private int BR;
    @Column
    private int CP;
    @Column
    private int UP;
    @Column
    private int CM;
    @Column
    private int MI;
    @Column
    private float LP;
    @Column
    private int BO;
    @Column
    private int GA;
    @Column
    private float PP;



}
