// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomPluginPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomPluginPlainArgs Empty = new GetCustomPluginPlainArgs();

    /**
     * Name of the custom plugin.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the custom plugin.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetCustomPluginPlainArgs() {}

    private GetCustomPluginPlainArgs(GetCustomPluginPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomPluginPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomPluginPlainArgs $;

        public Builder() {
            $ = new GetCustomPluginPlainArgs();
        }

        public Builder(GetCustomPluginPlainArgs defaults) {
            $ = new GetCustomPluginPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the custom plugin.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCustomPluginPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
