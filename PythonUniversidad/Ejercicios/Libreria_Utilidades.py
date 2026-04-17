# ======================================================
#  ARCHIVO DE UTILIDADES PYTHON
# Autor: Leonel Figueroa
# ======================================================

import math
import random

# ======================================================
# 🔢 MATEMÁTICAS BÁSICAS
# ======================================================

def suma(a,b): return a+b
def resta(a,b): return a-b
def multiplicacion(a,b): return a*b

def division(a,b):
    if b==0: raise ValueError("División entre 0")
    return a/b

def potencia(a,b): return a**b
def raiz(a): return math.sqrt(a)
def valor_absoluto(a): return abs(a)
def redondear(a,n=2): return round(a,n)
def maximo(lista): return max(lista)
def minimo(lista): return min(lista)

# ======================================================
# 🧮 ÁLGEBRA
# ======================================================

def ecuacion_lineal(m,x,b): return m*x+b
def pendiente(x1,y1,x2,y2): return (y2-y1)/(x2-x1)
def punto_medio(x1,y1,x2,y2): return ((x1+x2)/2,(y1+y2)/2)
def discriminante(a,b,c): return b**2-4*a*c

def resolver_cuadratica(a,b,c):
    d=discriminante(a,b,c)
    if d<0: return None
    x1=(-b+math.sqrt(d))/(2*a)
    x2=(-b-math.sqrt(d))/(2*a)
    return x1,x2

# ======================================================
# 📊 ESTADÍSTICA (TC)
# ======================================================

def media(d): return sum(d)/len(d)

def mediana(d):
    d=sorted(d)
    n=len(d)
    return (d[n//2-1]+d[n//2])/2 if n%2==0 else d[n//2]

def moda(d):
    f={}
    for x in d: f[x]=f.get(x,0)+1
    m=max(f.values())
    return [k for k,v in f.items() if v==m]

# ======================================================
# 📉 DISPERSIÓN
# ======================================================

def rango(d): return max(d)-min(d)
def varianza(d):
    m=media(d)
    return sum((x-m)**2 for x in d)/len(d)
def desviacion(d): return math.sqrt(varianza(d))
def coef_variacion(d): return desviacion(d)/media(d)

# ======================================================
# 🎲 PROBABILIDAD
# ======================================================

def factorial(n): return math.factorial(n)
def combinacion(n,r): return factorial(n)//(factorial(r)*factorial(n-r))
def permutacion(n,r): return factorial(n)//factorial(n-r)
def probabilidad(evento, total): return evento/total

# ======================================================
# 🔁 SUCESIONES
# ======================================================

def aritmetica(a1,d,n): return [a1+i*d for i in range(n)]
def geometrica(a1,r,n): return [a1*r**i for i in range(n)]

def fibonacci(n):
    f=[0,1]
    for i in range(2,n): f.append(f[i-1]+f[i-2])
    return f[:n]

# ======================================================
# 💻 SISTEMAS NUMÉRICOS
# ======================================================

def dec_a_bin(n): return bin(n)[2:]
def dec_a_oct(n): return oct(n)[2:]
def dec_a_hex(n): return hex(n)[2:].upper()

def bin_a_dec(b): return int(b,2)
def oct_a_dec(o): return int(o,8)
def hex_a_dec(h): return int(h,16)

def bin_a_hex(b): return dec_a_hex(bin_a_dec(b))
def bin_a_oct(b): return dec_a_oct(bin_a_dec(b))
def hex_a_bin(h): return dec_a_bin(hex_a_dec(h))
def oct_a_bin(o): return dec_a_bin(oct_a_dec(o))

# ======================================================
# 🔄 CONVERSIONES FÍSICAS
# ======================================================

# Temperatura
def c_a_f(c): return (c*9/5)+32
def f_a_c(f): return (f-32)*5/9
def c_a_k(c): return c+273.15
def k_a_c(k): return k-273.15

# Longitud
def m_a_km(m): return m/1000
def km_a_m(km): return km*1000
def cm_a_m(cm): return cm/100
def m_a_cm(m): return m*100

# Masa
def g_a_kg(g): return g/1000
def kg_a_g(kg): return kg*1000
def lb_a_kg(lb): return lb*0.4536
def kg_a_lb(kg): return kg/0.4536

# Tiempo
def s_a_min(s): return s/60
def min_a_h(m): return m/60
def h_a_s(h): return h*3600

# Velocidad
def ms_a_kmh(v): return v*3.6
def kmh_a_ms(v): return v/3.6

# ======================================================
# 📐 GEOMETRÍA
# ======================================================

def area_cuadrado(l): return l*l
def area_rectangulo(b,h): return b*h
def area_triangulo(b,h): return (b*h)/2
def area_circulo(r): return math.pi*r*r

def perimetro_circulo(r): return 2*math.pi*r
def volumen_cubo(l): return l**3
def volumen_esfera(r): return (4/3)*math.pi*r**3

# ======================================================
# ⚙️ FÍSICA BÁSICA
# ======================================================

def velocidad(d,t): return d/t
def aceleracion(vf,vi,t): return (vf-vi)/t
def fuerza(m,a): return m*a
def trabajo(F,d): return F*d
def potencia(W,t): return W/t
def energia_cinetica(m,v): return 0.5*m*v**2

# ======================================================
# 🧠 UTILIDADES DE PROGRAMACIÓN
# ======================================================

def es_par(n): return n%2==0
def es_impar(n): return n%2!=0
def es_primo(n):
    if n<2: return False
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0: return False
    return True

def random_num(a,b): return random.randint(a,b)

# ======================================================
# 📋 LISTAS Y DATOS
# ======================================================

def eliminar_repetidos(l): return list(set(l))
def ordenar(l): return sorted(l)
def promedio(l): return media(l)
def normalizar(l):
    mi=min(l); ma=max(l)
    return [(x-mi)/(ma-mi) for x in l]

# ======================================================
# 🔤 STRINGS
# ======================================================

def invertir_texto(t): return t[::-1]
def contar_vocales(t): return sum(1 for c in t.lower() if c in "aeiou")
def mayusculas(t): return t.upper()
def minusculas(t): return t.lower()
