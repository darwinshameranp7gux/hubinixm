/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kamike.divide;

import com.kamike.db.generic.GenericCreate;

/**
 *
 * @author THiNk
 */
public class KamiDatabaseCreate extends GenericCreate<KamiDatabase> {

    public KamiDatabaseCreate() {
        super();
    }

    @Override
    public KamiDatabase create() {
       return new KamiDatabase();
    }

}
