FROM eclipse-temurin:25-jdk AS build

WORKDIR /app

COPY *.java ./

RUN javac *.java

FROM eclipse-temurin:25-jre-alpine

WORKDIR /app

COPY --from=build /app/*.class ./

# Create a simple menu to run different programs
RUN echo '#!/bin/sh' > /app/run.sh && \
    echo 'case $1 in' >> /app/run.sh && \
    echo '  backtracking) java Backtracking ;;' >> /app/run.sh && \
    echo '  maze) java MazeSolver ;;' >> /app/run.sh && \
    echo '  nknights) java NKnights ;;' >> /app/run.sh && \
    echo '  nqueens) java NQueensProblem ;;' >> /app/run.sh && \
    echo '  path) java PrintTheMatrixOfPath ;;' >> /app/run.sh && \
    echo '  river) java RiverObstruction ;;' >> /app/run.sh && \
    echo '  sudoku) java SudokuSolver ;;' >> /app/run.sh && \
    echo '  *) echo "Usage: $0 {backtracking|maze|nknights|nqueens|path|river|sudoku}" && exit 1 ;;' >> /app/run.sh && \
    echo 'esac' >> /app/run.sh && \
    chmod +x /app/run.sh

ENTRYPOINT ["/app/run.sh"]
CMD [""]