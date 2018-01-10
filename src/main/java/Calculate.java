/**
 * Created by Михаил on 09.01.2018.
 */
@FunctionalInterface
interface Calculate<T extends Number> {

   public T exec(T var1, T var2);

    default Double getAdd(T var1, T var2){

        return var1.doubleValue()+var2.doubleValue();

    }

    default Double getSub(T var1, T var2){

        return var1.doubleValue()-var2.doubleValue();

        }

    default Double getDiv(T var1, T var2 ){

        return var1.doubleValue()/var2.doubleValue();

    }

    default Double getMulty(T var1, T var2){

        return var1.doubleValue()*var2.doubleValue();

    }


}

