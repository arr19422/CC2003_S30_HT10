import networkx as nx
import matplotlib.pyplot as plt

g = nx.DiGraph()

archivo = open('guategrafo.txt')
texto = archivo.read()
split = texto.split('\n')

for x in split:
    y = x.split(' ')
    g.add_edge(y[0], y[1], weight=int(y[2]))
    
archivo.close()

predecessor, distance = nx.floyd_warshall_predecessor_and_distance(g)

distancias = [[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0], [0,0,0,0,0]]

departamentos = {'Guatemala': 1, 'Sacatepequez': 2, 'Chimaltenango': 3, 'SantaRosa': 4, 'Escuintla': 5}

print(departamentos['Guatemala'])

x =0
for i in distance:
    d = distance[i]
    for j in d:
        print()
        distancias[departamentos[i]-1][departamentos[j]-1] = d[j]

print("Distancias:")
for i in distancias:
    print(i)

print("Predecesores:", predecessor)

nx.draw(g, with_labels=True)
plt.show()