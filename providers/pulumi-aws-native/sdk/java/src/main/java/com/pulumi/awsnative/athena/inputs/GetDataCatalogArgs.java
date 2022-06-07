// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataCatalogArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataCatalogArgs Empty = new GetDataCatalogArgs();

    /**
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetDataCatalogArgs() {}

    private GetDataCatalogArgs(GetDataCatalogArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataCatalogArgs $;

        public Builder() {
            $ = new GetDataCatalogArgs();
        }

        public Builder(GetDataCatalogArgs defaults) {
            $ = new GetDataCatalogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetDataCatalogArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
