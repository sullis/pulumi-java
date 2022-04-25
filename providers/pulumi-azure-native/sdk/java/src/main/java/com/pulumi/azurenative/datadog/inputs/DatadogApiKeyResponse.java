// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatadogApiKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatadogApiKeyResponse Empty = new DatadogApiKeyResponse();

    /**
     * The time of creation of the API key.
     * 
     */
    @Import(name="created")
    private @Nullable String created;

    /**
     * @return The time of creation of the API key.
     * 
     */
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * The user that created the API key.
     * 
     */
    @Import(name="createdBy")
    private @Nullable String createdBy;

    /**
     * @return The user that created the API key.
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The value of the API key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The value of the API key.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The name of the API key.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the API key.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private DatadogApiKeyResponse() {}

    private DatadogApiKeyResponse(DatadogApiKeyResponse $) {
        this.created = $.created;
        this.createdBy = $.createdBy;
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatadogApiKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatadogApiKeyResponse $;

        public Builder() {
            $ = new DatadogApiKeyResponse();
        }

        public Builder(DatadogApiKeyResponse defaults) {
            $ = new DatadogApiKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param created The time of creation of the API key.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable String created) {
            $.created = created;
            return this;
        }

        /**
         * @param createdBy The user that created the API key.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param key The value of the API key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param name The name of the API key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public DatadogApiKeyResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
