// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCatalogEncryptionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsArgs Empty = new DataCatalogEncryptionSettingsArgs();

    /**
     * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     * 
     */
    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId == null ? Codegen.empty() : this.catalogId;
    }

    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    @Import(name="dataCatalogEncryptionSettings", required=true)
      private final Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs> dataCatalogEncryptionSettings;

    public Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs> dataCatalogEncryptionSettings() {
        return this.dataCatalogEncryptionSettings;
    }

    public DataCatalogEncryptionSettingsArgs(
        @Nullable Output<String> catalogId,
        Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs> dataCatalogEncryptionSettings) {
        this.catalogId = catalogId;
        this.dataCatalogEncryptionSettings = Objects.requireNonNull(dataCatalogEncryptionSettings, "expected parameter 'dataCatalogEncryptionSettings' to be non-null");
    }

    private DataCatalogEncryptionSettingsArgs() {
        this.catalogId = Codegen.empty();
        this.dataCatalogEncryptionSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> catalogId;
        private Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs> dataCatalogEncryptionSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.dataCatalogEncryptionSettings = defaults.dataCatalogEncryptionSettings;
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Codegen.ofNullable(catalogId);
            return this;
        }
        public Builder dataCatalogEncryptionSettings(Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs> dataCatalogEncryptionSettings) {
            this.dataCatalogEncryptionSettings = Objects.requireNonNull(dataCatalogEncryptionSettings);
            return this;
        }
        public Builder dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs dataCatalogEncryptionSettings) {
            this.dataCatalogEncryptionSettings = Output.of(Objects.requireNonNull(dataCatalogEncryptionSettings));
            return this;
        }        public DataCatalogEncryptionSettingsArgs build() {
            return new DataCatalogEncryptionSettingsArgs(catalogId, dataCatalogEncryptionSettings);
        }
    }
}
