// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataCatalogEncryptionSettingsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataCatalogEncryptionSettingsArgs Empty = new GetDataCatalogEncryptionSettingsArgs();

    /**
     * The ID of the Data Catalog. This is typically the AWS account ID.
     * 
     */
    @Import(name="catalogId", required=true)
    private String catalogId;

    /**
     * @return The ID of the Data Catalog. This is typically the AWS account ID.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }

    private GetDataCatalogEncryptionSettingsArgs() {}

    private GetDataCatalogEncryptionSettingsArgs(GetDataCatalogEncryptionSettingsArgs $) {
        this.catalogId = $.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataCatalogEncryptionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataCatalogEncryptionSettingsArgs $;

        public Builder() {
            $ = new GetDataCatalogEncryptionSettingsArgs();
        }

        public Builder(GetDataCatalogEncryptionSettingsArgs defaults) {
            $ = new GetDataCatalogEncryptionSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId The ID of the Data Catalog. This is typically the AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public GetDataCatalogEncryptionSettingsArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            return $;
        }
    }

}
