// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceWebCrawlerBasicAuthentication {
    private final String credentials;
    private final String host;
    private final Integer port;

    @CustomType.Constructor
    private DataSourceWebCrawlerBasicAuthentication(
        @CustomType.Parameter("credentials") String credentials,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port) {
        this.credentials = credentials;
        this.host = host;
        this.port = port;
    }

    public String credentials() {
        return this.credentials;
    }
    public String host() {
        return this.host;
    }
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerBasicAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String credentials;
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerBasicAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder credentials(String credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public DataSourceWebCrawlerBasicAuthentication build() {
            return new DataSourceWebCrawlerBasicAuthentication(credentials, host, port);
        }
    }
}
