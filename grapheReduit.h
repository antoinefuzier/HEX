#include <stdio.h>
#include <stdlib.h>
#include "graphe.h"




typedef struct s_graphe_reduit grapheReduit;


int graphe_reduit_countPont(graphereduit g,pion p);


grapheReduit graphe_reduit_create (graphe g);


void graphe_reduit_destroy(grapheReduit* g);


char graphe_redyut_detectwinner(grapheReduit g, pion p);



