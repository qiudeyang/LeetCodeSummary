awk 'NR==10' file.txt
awk '{if(NR==10) print}' file.txt
awk '{if(NR==10) print $0}' file.txt
# head -n 10 file.txt | tail -n 1  文件行数少于十行，取最后一行
