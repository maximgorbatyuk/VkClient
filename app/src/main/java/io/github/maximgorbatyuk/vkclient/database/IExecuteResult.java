package io.github.maximgorbatyuk.vkclient.database;

import java.util.List;

import io.github.maximgorbatyuk.vkclient.help.Audio;

/**
 * Created by Maxim on 12.05.2016.
 */
public interface IExecuteResult {

    void onExecute(int result);
    void onExecute(List<Audio> list);
}
