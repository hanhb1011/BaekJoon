#include <stdio.h>

int Y, X, i, j,k,c,y, x, dy[4] = { -1,1,0,0 }, dx[4] = { 0,0,-1,1 }, del[11][11],minx=11,miny=11,maxy,maxx;
char m[11][11];

main() {

	scanf("%d%d", &Y, &X);
	for (i = 0; i < Y; i++)
		scanf("%s", m[i]);

	for (i = 0; i < Y; i++) {
		for (j = 0; j < X; j++) {
			if (m[i][j] == '.')
				continue;
			c = 0;
			for (k = 0; k < 4; k++) {
				y = i + dy[k];
				x = j + dx[k];
				if (y < 0 || y == Y || x < 0 || x == X || m[y][x] == '.')
					c++;
			}
			if (c >= 3)
				del[i][j] = 1;
		}
	}

	for (i = 0; i < Y; i++)
		for (j = 0; j < X; j++) {
			if (del[i][j])
				m[i][j] = '.';
			
			if (m[i][j] == 'X') {
				minx = minx < j ? minx : j;
				miny = miny < i ? miny : i;
				maxx = maxx > j ? maxx : j;
				maxy = maxy > i ? maxy : i;
			}
		}
	
	for (i = miny; i <= maxy; i++) {
		for (j = minx; j <= maxx; j++)
			printf("%c", m[i][j]);
		printf("\n");
	}

}
