count=`head -n 1 file.txt | wc -w`
for i in 1 to $count
do
echo cut -d ' ' -f $i file.txt
done 
