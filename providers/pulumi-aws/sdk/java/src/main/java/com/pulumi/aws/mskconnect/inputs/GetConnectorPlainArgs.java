// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorPlainArgs Empty = new GetConnectorPlainArgs();

    /**
     * Name of the connector.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the connector.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetConnectorPlainArgs() {}

    private GetConnectorPlainArgs(GetConnectorPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorPlainArgs $;

        public Builder() {
            $ = new GetConnectorPlainArgs();
        }

        public Builder(GetConnectorPlainArgs defaults) {
            $ = new GetConnectorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the connector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetConnectorPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
