package plantas.interacaoUsuario;

import plantas.especiePlanta.EspeciePlanta;

import java.util.HashMap;
import java.util.Map;

public class CriarEspeciesPlantas {

    public static Map<String, EspeciePlanta> criasEspeciesPlantas() {
        EspeciePlanta tomate = new EspeciePlanta("Tomate",
                "Frutas e Legumes, Plantas Hortícolas.",
                "A cada 120 dias.",
                "Regular.",
                "Solos bem drenados, férteis, ricos em matéria orgânica, com certa profundidade e com acidez controlada.",
                "O tomateiro se adapta à uma ampla variedade climática, podendo ser plantado em hortas e vasos, ao ar livre ou em estufas. Basta para isso escolher a cultivar mais apropriada ao clima, à estação do ano e ao paladar.");
        EspeciePlanta acerola = new EspeciePlanta("" +
                "Acerola",
                "Árvores Frutíferas e  Arbustos Tropicais",
                "Anual",
                "Regular",
                "Solos Férteis, bem drenáveis e enriquecidos com matéria orgânica.",
                "Planta tropical, não é tolerante à geadas ou secas prolongadas. Aceroleira ser tropical faz com que ela se comporte de uma maneira diferente das árvores frutíferas mais comuns. Ela é mais rústica e resistente a doenças e pragas e menos exigente no seu manejo.");
        EspeciePlanta alface = new EspeciePlanta("Alface",
                "Folhas e Flores, Medicinal, Plantas Hortícolas.",
                "A cada 70 dias.",
                "Diariamente.",
                "Solo bem drenado, rico em matéria orgânica, fértil, com boa disponibilidade de nitrogênio.",
                "As alfaces em geral apresentam folhas macias, grandes, de sabor suave e refrescante, que crescem em volta do caule pequeno(em roseta), podendo ser lisas ou crespas, formando ou não uma cabeça e podem apresentar diversas tonalidades de verde e roxo-bronzeado.");
        EspeciePlanta rabanete = new EspeciePlanta("Rabanete",
                "Plantas hortícolas, raizes e rizomas",
                "As sementes germinam em 4 a 10 dias e os rabanetes podem ser colhidos em cerca de 33 dias",
                "Regular",
                "Em solo fértil, drenável, neutro, enriquecido com matéria orgânica e irrigado regularmente",
                "Os frutos contêm pequenas sementes, de cor marrom, que podem conservar seu poder germinativo por até 10 anos.");
        EspeciePlanta jabuticaba = new EspeciePlanta("Jabuticaba",
                "Árvores Frutíferas",
                "10 Anos",
                "Regular",
                "Solos Férteis, bem drenáveis e enriquecidos com matéria orgânica.",
                "Na primavera surgem do tronco numerosas flores brancas, que cobrem quase toda sua extensão. Este processo ocorre simultaneamente à queda das folhas, modificando completamente a aparência da árvore. Após a polinização, as flores gradativamente vão sendo substituídas por pequenos frutos verdes, esféricos, que tornam-se vermelhos e depois negros, quando completamente amadurecidos.");
        EspeciePlanta laranja = new EspeciePlanta("Laranja",
                "Árvores Frutíferas",
                "Pode ser anual, mais abundante durante o outono",
                "Regular",
                "Solos Férteis, leves e enriquecidos com matéria orgânica.",
                "O plantio das mudas devem ser realizadas durante a estações chuvosas, para facilitar a chance da muda crescer. Relativamente uma planta rústica e de fácil adaptação, cuidado que ela é sensível a pragas e doenças que reduzem sua produtividade.");
        EspeciePlanta amorereira = new EspeciePlanta("Amoreira",
                "Árvores frutíferas",
                "Cerca de um ano e meio",
                "Regular",
                "Deve ser cultivada sob sol pleno, em solo fértil, profundo, drenável, enriquecido com matéria orgânica e irrigado regularmente no primeiro ano de implantação",
                " Apesar de ser originária de clima temperado, a amoreira se adapta bem ao clima tropical e subtropical.");
        EspeciePlanta salsinha = new EspeciePlanta("Salsinha",
                "Ervas Condimentares, Plantas Hortícolas",
                "Anual",
                "Regular",
                "Férteis, drenáveis, leves e enriquecidos com matéria orgânica",
                "A salsinha tolera frio e geadas, mas ressente-se com o calor intenso ou estiagem, colha as folhas mais externas dando um bom intervalo entre as colheitas para a planta se recuperar sem perder o viço.");
        EspeciePlanta caqui = new EspeciePlanta("Caqui",
                "Árvores Frutíferas",
                "Anual",
                " Irrigado regularmente durante o período de crescimento e frutificação",
                "Solo fértil, drenável, enriquecido com matéria orgânica",
                "Durante o período vegetativo, adubações ricas em nitrogênio e potássio são bem vindas, parceladas e sem excessos, caso contrário pode-se comprometer a frutificação.");
        EspeciePlanta goiaba = new EspeciePlanta("Goiaba",
                " Árvores Frutíferas",
                "Anual",
                "Periodicamente",
                "Solos Férteis, drenáveis, leves e enriquecidos com matéria orgânica",
                "Durante o crescimento do fruto, este deve ser ensacado para a proteção contra a mosca-das-frutas, frutos que estiverem rachados e podres devem ser enterrado para não ser disseminado a praga.");
        EspeciePlanta abobora = new EspeciePlanta("Abóbora",
                "Frutas e Legumes",
                "Anual",
                "Regular",
                "Solos Férteis, bem drenáveis e enriquecidos com matéria orgânica.",
                "Planta tropical, não é tolerante à geadas ou secas prolongadas. Na cultura da abóbora é importante observar que não desenvolvam-se plantas daninhas, que prejudicam muito a produtividade da planta. Multiplica-se facilmente por sementes.");
        EspeciePlanta limao = new EspeciePlanta("Limão",
                " Árvores Frutíferas",
                "120 dias",
                "Regulares",
                "Solos Férteis, drenáveis, calados e enriquecidos com matéria orgânica",
                "Limoeiros são árvores rústicas, são mais adaptáveis a climas temperados e subtropicais, multiplicam-se por sementes, estaquia, mas normalmente por enxertia.");
        EspeciePlanta manga = new EspeciePlanta("Manga",
                "Árvores Frutíferas",
                "Entre Setembro e Janeiro.",
                "Suplementação de água, na forma de irrigação, em períodos de seca prolongada.",
                "Solos com média fertilidade, de arenosos até argilosos, porém preferencialmente areno-argilosos, profundos, permeáveis, bem drenados e ligeiramente ácidos.",
                "Sua casca é fina, porém resistente, e pode apresentar cores diversas entre o verde, vermelho, rosa, amarelo ou laranja, com ou sem manchas pretas. A polpa é originalmente fibrosa, suculenta, de coloração amarela ou alaranjada.");
        EspeciePlanta oregano = new EspeciePlanta("Orégano",
                "Ervas Condimentares, Plantas Hortícolas",
                "120 dias",
                "Regulares",
                "Solos Férteis, drenáveis, enriquecidos com matéria orgânica",
                "Orégano apesar de sobreviver à meia sombra, sua folhagem não adquire aroma tão intensos nessas condições, apesar de ser perene deve ser replantado a cada 2 ou 3 anos.");
        EspeciePlanta cebola = new EspeciePlanta("Cebola",
                "Ervas Condimentares,  Raízes e Rizomas",
                "80 a 165 dias",
                "Regulares",
                "Solos Férteis, levemente ácidos, enriquecidos com matéria orgânica",
                "Cebola precisa de um solo bem revolvido e adubado e bom espaçamento para o perfeito desenvolvimento dos bulbo, as mudas devem ser transplantadas entre 30 a 40 dias  após a semeadura.");
        EspeciePlanta hortela = new EspeciePlanta("Hortelã",
                "Ervas Condimentares, Medicinal, Plantas Hortícolas.",
                "Final da primavera até o início do outono.",
                "2 – 3 vezes por semana entre colheitas.",
                "O solo deve ser fértil e enriquecido com matéria orgânica para uma boa produção.",
                "As folhas são oval-lanceoladas e serrilhadas, de cor verde a arroxeada, um tanto pilosas e têm um forte aroma refrescante. De seu óleo essencial se extrai o mentol. As flores são numerosas e roxas e se apresentam em inflorescências terminais do tipo espiga.");
        EspeciePlanta cenoura = new EspeciePlanta("Cenoura",
                "Medicinal, Plantas Hortícolas, Raízes e Rizomas",
                "Anual",
                "Regulares",
                "Solo fértil, calado e fofo, enriquecido com matéria orgânica e irrigado regularmente",
                "As mais diversas espécies animais, domésticas e silvestres, também apreciam a cenoura, como alimento refrescante e saboroso, entre estes podemos citar os cavalos, suínos, ruminantes, aves e até mesmo os cães.");
        EspeciePlanta cebolinha = new EspeciePlanta("Cebolinha",
                "Ervas Condimentares,  Plantas Hortícolas",
                "75 a 120 dias",
                "Regulares",
                "Solos Férteis, bem preparado, enriquecidos com matéria orgânica",
                "A cebolinha vegeta em uma ampla faixa climática, adaptada ao frio e calor, mas prefere o clima ameno, para a colheita pode arrancar a planta inteira ou cortar as folhas na base para que rebrote.");
        EspeciePlanta rucula = new EspeciePlanta("Rúcula",
                "Folhas e Flores, Medicinal, Plantas Hortícolas.",
                "A cada 40 dias.",
                "Diariamente.",
                "Solos equilibrados entre argilosos e arenosos, com muita matéria orgânica e com acidez baixa.",
                "A rúcula apresenta folhas verde escuras, dispostas em roseta, pinadas em 4 a 10 profundos lobos laterais e um grande lobo terminal. Elas são tenras quando jovens, e gradativamente vão ficando mais firmes e fibrosas.");
        EspeciePlanta alecrim = new EspeciePlanta("Alecrim",
                "Ervas Condimentares,  Plantas Hortícolas",
                "90 dias",
                "Regulares",
                "Solos Férteis, drenável, solos arenosos e pedregosos ",
                " Quanto maior a quantidade de sol o alecrim receber será mais pungente e forte será o aroma nas folhas, assim é melhor evitar cultivá-lo em locais com baixa luminosidade natural. ");

        //Adicionando-as em um mapa
        Map<String, EspeciePlanta> plantas = new HashMap<>();
        plantas.put(tomate.getNomeEspecie(), tomate);
        plantas.put(acerola.getNomeEspecie(), acerola);
        plantas.put(alface.getNomeEspecie(), alface);
        plantas.put(rabanete.getNomeEspecie(), rabanete);
        plantas.put(jabuticaba.getNomeEspecie(), jabuticaba);
        plantas.put(laranja.getNomeEspecie(), laranja);
        plantas.put(amorereira.getNomeEspecie(), amorereira);
        plantas.put(salsinha.getNomeEspecie(), salsinha);
        plantas.put(caqui.getNomeEspecie(), caqui);
        plantas.put(goiaba.getNomeEspecie(), goiaba);
        plantas.put(abobora.getNomeEspecie(), abobora);
        plantas.put(limao.getNomeEspecie(), limao);
        plantas.put(manga.getNomeEspecie(), manga);
        plantas.put(oregano.getNomeEspecie(), oregano);
        plantas.put(cebola.getNomeEspecie(), cebola);
        plantas.put(hortela.getNomeEspecie(), hortela);
        plantas.put(cenoura.getNomeEspecie(), cenoura);
        plantas.put(cebolinha.getNomeEspecie(), cebolinha);
        plantas.put(rucula.getNomeEspecie(), rucula);
        plantas.put(alecrim.getNomeEspecie(), alecrim);

        return plantas;
    }
}
