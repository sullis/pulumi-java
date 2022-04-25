// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Specifies how metastore metadata should be integrated with the Data Catalog service.
 * 
 */
public final class DataCatalogConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataCatalogConfigResponse Empty = new DataCatalogConfigResponse();

    /**
     * Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    private DataCatalogConfigResponse() {}

    private DataCatalogConfigResponse(DataCatalogConfigResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCatalogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCatalogConfigResponse $;

        public Builder() {
            $ = new DataCatalogConfigResponse();
        }

        public Builder(DataCatalogConfigResponse defaults) {
            $ = new DataCatalogConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public DataCatalogConfigResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
