// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies a location to extract JWT from an API request.
 * 
 */
public final class JwtLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JwtLocationArgs Empty = new JwtLocationArgs();

    /**
     * Specifies HTTP header name to extract JWT token.
     * 
     */
    @InputImport(name="header")
      private final @Nullable Input<String> header;

    public Input<String> getHeader() {
        return this.header == null ? Input.empty() : this.header;
    }

    /**
     * Specifies URL query parameter name to extract JWT token.
     * 
     */
    @InputImport(name="query")
      private final @Nullable Input<String> query;

    public Input<String> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer " with a space at the end.
     * 
     */
    @InputImport(name="valuePrefix")
      private final @Nullable Input<String> valuePrefix;

    public Input<String> getValuePrefix() {
        return this.valuePrefix == null ? Input.empty() : this.valuePrefix;
    }

    public JwtLocationArgs(
        @Nullable Input<String> header,
        @Nullable Input<String> query,
        @Nullable Input<String> valuePrefix) {
        this.header = header;
        this.query = query;
        this.valuePrefix = valuePrefix;
    }

    private JwtLocationArgs() {
        this.header = Input.empty();
        this.query = Input.empty();
        this.valuePrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> header;
        private @Nullable Input<String> query;
        private @Nullable Input<String> valuePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.query = defaults.query;
    	      this.valuePrefix = defaults.valuePrefix;
        }

        public Builder setHeader(@Nullable Input<String> header) {
            this.header = header;
            return this;
        }

        public Builder setHeader(@Nullable String header) {
            this.header = Input.ofNullable(header);
            return this;
        }

        public Builder setQuery(@Nullable Input<String> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder setValuePrefix(@Nullable Input<String> valuePrefix) {
            this.valuePrefix = valuePrefix;
            return this;
        }

        public Builder setValuePrefix(@Nullable String valuePrefix) {
            this.valuePrefix = Input.ofNullable(valuePrefix);
            return this;
        }
        public JwtLocationArgs build() {
            return new JwtLocationArgs(header, query, valuePrefix);
        }
    }
}