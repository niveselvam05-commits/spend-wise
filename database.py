import sqlite3

def connect():
    conn = sqlite3.connect("spendwise.db")
    cur = conn.cursor()

    cur.execute("""
    CREATE TABLE IF NOT EXISTS expenses(
        id INTEGER PRIMARY KEY,
        name TEXT,
        amount REAL,
        category TEXT,
        date TEXT
    )
    """)

    conn.commit()
    conn.close()

def insert(name, amount, category, date):
    conn = sqlite3.connect("spendwise.db")
    cur = conn.cursor()

    cur.execute("INSERT INTO expenses VALUES(NULL,?,?,?,?)",
                (name, amount, category, date))

    conn.commit()
    conn.close()

def view():
    conn = sqlite3.connect("spendwise.db")
    cur = conn.cursor()

    cur.execute("SELECT * FROM expenses")
    rows = cur.fetchall()

    conn.close()
    return rows
