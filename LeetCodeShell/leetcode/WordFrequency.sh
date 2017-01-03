cat content.txt | awk '{for(i=1;i<=NF;i++){count[$i]++}}
