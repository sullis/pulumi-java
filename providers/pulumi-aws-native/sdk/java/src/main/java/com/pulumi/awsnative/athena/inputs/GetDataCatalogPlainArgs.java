// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataCatalogPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataCatalogPlainArgs Empty = new GetDataCatalogPlainArgs();

    /**
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetDataCatalogPlainArgs() {}

    private GetDataCatalogPlainArgs(GetDataCatalogPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataCatalogPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataCatalogPlainArgs $;

        public Builder() {
            $ = new GetDataCatalogPlainArgs();
        }

        public Builder(GetDataCatalogPlainArgs defaults) {
            $ = new GetDataCatalogPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetDataCatalogPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
