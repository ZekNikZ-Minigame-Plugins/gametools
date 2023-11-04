package io.zkz.mc.gametools.util.observable

interface IObservable<T : IObservable<T>> {
    val listeners: Collection<IObserver<T>>

    fun addListener(observer: IObserver<T>)

    fun removeListener(observer: IObserver<T>)

    fun notifyObservers() {
        listeners.forEach {
            it.handleChanged(this)
        }
    }
}
