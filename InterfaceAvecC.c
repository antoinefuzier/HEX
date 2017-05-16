#include <stdlib.h>
#include <assert.h>
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <jni.h>
#include "InterfaceAvecC.h"
#include "graphe.h"



JNIEXPORT jstring JNICALL
Java_InterfaceAvecC_creerGraphe (JNIEnv *env, jclass cl, jint ji) {


/* traitement en C */
char* res=graphe_toString(graphe_create(ji));
/* conversion du résultat en chaîne Java */
jstring jres = (*env)->NewStringUTF(env, res);
/* libération mémoire */

return jres;

}
