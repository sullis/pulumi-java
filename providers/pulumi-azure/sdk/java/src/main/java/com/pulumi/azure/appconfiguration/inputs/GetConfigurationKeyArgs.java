// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigurationKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigurationKeyArgs Empty = new GetConfigurationKeyArgs();

    /**
     * Specifies the id of the App Configuration.
     * 
     */
    @Import(name="configurationStoreId", required=true)
    private String configurationStoreId;

    /**
     * @return Specifies the id of the App Configuration.
     * 
     */
    public String configurationStoreId() {
        return this.configurationStoreId;
    }

    /**
     * The name of the App Configuration Key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The name of the App Configuration Key.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The label of the App Configuration Key.
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return The label of the App Configuration Key.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    private GetConfigurationKeyArgs() {}

    private GetConfigurationKeyArgs(GetConfigurationKeyArgs $) {
        this.configurationStoreId = $.configurationStoreId;
        this.key = $.key;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigurationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigurationKeyArgs $;

        public Builder() {
            $ = new GetConfigurationKeyArgs();
        }

        public Builder(GetConfigurationKeyArgs defaults) {
            $ = new GetConfigurationKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationStoreId Specifies the id of the App Configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationStoreId(String configurationStoreId) {
            $.configurationStoreId = configurationStoreId;
            return this;
        }

        /**
         * @param key The name of the App Configuration Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param label The label of the App Configuration Key.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        public GetConfigurationKeyArgs build() {
            $.configurationStoreId = Objects.requireNonNull($.configurationStoreId, "expected parameter 'configurationStoreId' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
