// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListIngestionSettingTokensArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListIngestionSettingTokensArgs Empty = new ListIngestionSettingTokensArgs();

    /**
     * Name of the ingestion setting
     * 
     */
    @InputImport(name="ingestionSettingName", required=true)
    private final String ingestionSettingName;

    public String getIngestionSettingName() {
        return this.ingestionSettingName;
    }

    public ListIngestionSettingTokensArgs(String ingestionSettingName) {
        this.ingestionSettingName = Objects.requireNonNull(ingestionSettingName, "expected parameter 'ingestionSettingName' to be non-null");
    }

    private ListIngestionSettingTokensArgs() {
        this.ingestionSettingName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIngestionSettingTokensArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ingestionSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIngestionSettingTokensArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestionSettingName = defaults.ingestionSettingName;
        }

        public Builder setIngestionSettingName(String ingestionSettingName) {
            this.ingestionSettingName = Objects.requireNonNull(ingestionSettingName);
            return this;
        }

        public ListIngestionSettingTokensArgs build() {
            return new ListIngestionSettingTokensArgs(ingestionSettingName);
        }
    }
}
