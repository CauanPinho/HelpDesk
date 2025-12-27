PRAGMA foreign_keys = ON;

       --=====================
       --===TABELA: USUARIOS===
       --=====================
       CREATE TABLE IF NOT EXISTS usuarios(
             id INTEGER PRIMARY KEY AUTOINCREMENT,
             nome TEXT NOT NULL,
             email TEXT NOT NULL UNIQUE ,
             tipo TEXT NOT NULL CHECK (tipo IN ('CLIENTE','AGENTE','ADMIN')),
             ativo INTEGER NOT NULL DEFAULT 1 CHECK(ativo IN (0,1))
       );
--==========================
--===TABELA DE CATEGORIAS===
--==========================
        CREATE TABLE IF NOT EXISTS categorias(
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            nome TEXT NOT NULL UNIQUE,
            descricao TEXT
        );


