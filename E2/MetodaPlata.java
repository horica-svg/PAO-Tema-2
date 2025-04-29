package E2;

public sealed abstract class MetodaPlata permits Card, Cash, TransferBancar {
    public abstract void valideaza();
}
