-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 11/12/2018 às 14:29
-- Versão do servidor: 10.1.30-MariaDB
-- Versão do PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `Compras`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `rua` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Fazendo dump de dados para tabela `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nome`, `telefone`, `cpf`, `rua`) VALUES
(1, 'Cleilce', '(88) 99683-2644', '567.586.635-25', 'São Vicente de Paula'),
(2, 'Clésia', '(88) 98234-6633', '367.548.654-32', 'São Vicente de Paula'),
(3, 'Cleide', '(88) 96783-4553', '725.862.379-28', 'São Vicente de Paula'),
(4, 'Vanizia ', '(88) 97528-8152', '456.755.245-24', 'São Vicente de Paula'),
(5, 'Maria', '(88) 96234-5324', '086.587.326-24', 'São Vicente de Paula'),
(6, 'Clévia', '(88) 97435-6235', '786.582.156-27', 'São Vicente de Paula'),
(7, 'Cleidiane', '(88) 99825-3456', '231.564.756-95', 'São Vicente de Paula'),
(8, 'André', '(88) 99476-2762', '622.423.433-53', 'São Vicente de Paula'),
(9, 'Márcio', '(88) 96848-5714', '896.587.156-25', 'São Vicente de Paula');

-- --------------------------------------------------------

--
-- Estrutura para tabela `compras`
--

CREATE TABLE `compras` (
  `idcompra` int(11) NOT NULL,
  `nomepro` varchar(100) NOT NULL,
  `nomecli` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `preco` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Fazendo dump de dados para tabela `compras`
--

INSERT INTO `compras` (`idcompra`, `nomepro`, `nomecli`, `quantidade`, `preco`) VALUES
(1, 'Cuzcuz', 'Cleilce', 3, 1.2),
(2, 'Coca-Cola 2L', 'Clésia', 1, 6.5),
(3, 'Coca-Cola 2L', 'Vanizia ', 2, 6.5),
(4, 'Miojo', 'Cleide', 3, 0.7);

-- --------------------------------------------------------

--
-- Estrutura para tabela `fatura`
--

CREATE TABLE `fatura` (
  `idfatura` int(11) NOT NULL,
  `idcompra` int(11) NOT NULL,
  `nomecli` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `preco` double NOT NULL,
  `valortotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `idfuncionario` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Fazendo dump de dados para tabela `funcionario`
--

INSERT INTO `funcionario` (`idfuncionario`, `nome`, `login`, `senha`) VALUES
(1, 'Filipi Desidério', 'Filipi ', 'dd'),
(2, 'Manoel Carvalho', 'Neo', 'coxinha');

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `idproduto` int(11) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `quant` int(11) NOT NULL,
  `preco` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Fazendo dump de dados para tabela `produto`
--

INSERT INTO `produto` (`idproduto`, `nome`, `quant`, `preco`) VALUES
(1, 'Cuzcuz', 50, 1.2),
(2, 'Coca-Cola 2L', 100, 6.5),
(3, 'Açucar', 50, 2),
(4, 'Miojo', 50, 0.7),
(5, 'Macarrão', 50, 3);

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Índices de tabela `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`idcompra`);

--
-- Índices de tabela `fatura`
--
ALTER TABLE `fatura`
  ADD PRIMARY KEY (`idfatura`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`idfuncionario`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idproduto`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `compras`
--
ALTER TABLE `compras`
  MODIFY `idcompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `fatura`
--
ALTER TABLE `fatura`
  MODIFY `idfatura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `idfuncionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
