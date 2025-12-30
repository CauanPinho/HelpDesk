PRAGMA foreign_keys = ON;

-- =========================
-- TABELA: USUARIOS
-- =========================
CREATE TABLE IF NOT EXISTS usuarios (
  id    INTEGER PRIMARY KEY AUTOINCREMENT,
  nome  TEXT NOT NULL,
  email TEXT NOT NULL UNIQUE,
  tipo  TEXT NOT NULL CHECK (tipo IN ('CLIENTE','AGENTE','ADMIN')),
  ativo INTEGER NOT NULL DEFAULT 1 CHECK (ativo IN (0,1))
);

-- =========================
-- TABELA: CATEGORIAS
-- =========================
CREATE TABLE IF NOT EXISTS categorias (
  id        INTEGER PRIMARY KEY AUTOINCREMENT,
  nome      TEXT NOT NULL UNIQUE,
  descricao TEXT
);

-- =========================
-- TABELA: CHAMADOS
-- =========================
CREATE TABLE IF NOT EXISTS chamados (
  id            INTEGER PRIMARY KEY AUTOINCREMENT,
  titulo        TEXT NOT NULL,
  descricao     TEXT,

  categoria_id  INTEGER NOT NULL,
  status        TEXT NOT NULL CHECK (status IN (
    'ABERTO',
    'EM_ATENDIMENTO',
    'AGUARDANDO_CLIENTE',
    'RESOLVIDO',
    'CANCELADO'
  )),

  cliente_id    INTEGER NOT NULL,
  responsavel_id INTEGER,

  criado_em     TEXT NOT NULL,
  atualizado_em TEXT NOT NULL,
  fechado_em    TEXT,

  FOREIGN KEY (categoria_id) REFERENCES categorias(id),
  FOREIGN KEY (cliente_id) REFERENCES usuarios(id),
  FOREIGN KEY (responsavel_id) REFERENCES usuarios(id)
);

-- =========================
-- TABELA: CHAMADO_LOGS
-- =========================
CREATE TABLE IF NOT EXISTS chamado_logs (
  id        INTEGER PRIMARY KEY AUTOINCREMENT,
  chamado_id INTEGER NOT NULL,
  autor_id  INTEGER NOT NULL,
  acao      TEXT NOT NULL,
  detalhes  TEXT,
  data_hora TEXT NOT NULL,

  FOREIGN KEY (chamado_id) REFERENCES chamados(id),
  FOREIGN KEY (autor_id) REFERENCES usuarios(id)
);
