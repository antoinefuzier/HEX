#makefile grapheReduit
CC=gcc
OPT=-Wall -g
EXEC= grapeReduit
all : $(EXEC)

#compile grapheReduit
grapheReduit.o: grapheReduit.c
	$(CC) -o grapheReduit.o -c grapheReduit.c $(OPT)


#link grapheReduit RBT 
$(EXEC): grapheReduit.o RBT.o 
	$(CC) grapheReduit.o RBT.o -o $(EXEC)

clean:
	rm -rf *.o *.exe $(EXEC)
