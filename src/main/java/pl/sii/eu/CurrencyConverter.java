package pl.sii.eu;

import pl.sii.eu.model.Amount;

/**
 * Implement CurrencyConverter that will convert {@link Amount} instances between EUR & PLN {@link pl.sii.eu.model.Currency}.
 * Make sure that the result is always rounded to two fractional digits so that:
 * 10 EUR -> 42.52 PLN, but
 * 100 EUR -> 425.18 PLN
 */
interface CurrencyConverter {
    Amont.Currency euroAmount = Amount.Currency.EUR;
    Amont.Currency plnAmount = Amount.Currency.PLN;
       
    double EURO_TO_PLN_RATIO = 4.25181073;
    
    Amount convertToPln(Amount euroAmount{
        public Amount pln;
        pln = Amount*EURO_TO_PLN_RATIO;
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(PRECISION);
        df.setMinimumFractionDigits(PRECISION);
        return (df.format(pln));                         
    }
    Amount convertToEur(Amount plnAmount){
        public Amount eur;
        eur = Amount/EURO_TO_PLN_RATIO;
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(PRECISION);
        df.setMinimumFractionDigits(PRECISION);
        return (df.format(eur));
    }
    
    Amount convertToPln(Amount euroAmount);
    Amount convertToEur(Amount plnAmount);
}

