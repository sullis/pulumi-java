// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="header")
      private final @Nullable Output<String> header;

    public Output<String> getHeader() {
        return this.header == null ? Output.empty() : this.header;
    }

    /**
     * Specifies URL query parameter name to extract JWT token.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    /**
     * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer " with a space at the end.
     * 
     */
    @Import(name="valuePrefix")
      private final @Nullable Output<String> valuePrefix;

    public Output<String> getValuePrefix() {
        return this.valuePrefix == null ? Output.empty() : this.valuePrefix;
    }

    public JwtLocationArgs(
        @Nullable Output<String> header,
        @Nullable Output<String> query,
        @Nullable Output<String> valuePrefix) {
        this.header = header;
        this.query = query;
        this.valuePrefix = valuePrefix;
    }

    private JwtLocationArgs() {
        this.header = Output.empty();
        this.query = Output.empty();
        this.valuePrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> header;
        private @Nullable Output<String> query;
        private @Nullable Output<String> valuePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.query = defaults.query;
    	      this.valuePrefix = defaults.valuePrefix;
        }

        public Builder header(@Nullable Output<String> header) {
            this.header = header;
            return this;
        }
        public Builder header(@Nullable String header) {
            this.header = Output.ofNullable(header);
            return this;
        }
        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Output.ofNullable(query);
            return this;
        }
        public Builder valuePrefix(@Nullable Output<String> valuePrefix) {
            this.valuePrefix = valuePrefix;
            return this;
        }
        public Builder valuePrefix(@Nullable String valuePrefix) {
            this.valuePrefix = Output.ofNullable(valuePrefix);
            return this;
        }        public JwtLocationArgs build() {
            return new JwtLocationArgs(header, query, valuePrefix);
        }
    }
}
