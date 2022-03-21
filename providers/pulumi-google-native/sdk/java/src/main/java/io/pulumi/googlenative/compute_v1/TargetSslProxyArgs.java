// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.TargetSslProxyProxyHeader;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetSslProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetSslProxyArgs Empty = new TargetSslProxyArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader")
      private final @Nullable Output<TargetSslProxyProxyHeader> proxyHeader;

    public Output<TargetSslProxyProxyHeader> getProxyHeader() {
        return this.proxyHeader == null ? Output.empty() : this.proxyHeader;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * URL to the BackendService resource.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="sslCertificates")
      private final @Nullable Output<List<String>> sslCertificates;

    public Output<List<String>> getSslCertificates() {
        return this.sslCertificates == null ? Output.empty() : this.sslCertificates;
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not set, the TargetSslProxy resource will not have any SSL policy configured.
     * 
     */
    @Import(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> getSslPolicy() {
        return this.sslPolicy == null ? Output.empty() : this.sslPolicy;
    }

    public TargetSslProxyArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<TargetSslProxyProxyHeader> proxyHeader,
        @Nullable Output<String> requestId,
        @Nullable Output<String> service,
        @Nullable Output<List<String>> sslCertificates,
        @Nullable Output<String> sslPolicy) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyHeader = proxyHeader;
        this.requestId = requestId;
        this.service = service;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
    }

    private TargetSslProxyArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.proxyHeader = Output.empty();
        this.requestId = Output.empty();
        this.service = Output.empty();
        this.sslCertificates = Output.empty();
        this.sslPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetSslProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<TargetSslProxyProxyHeader> proxyHeader;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> service;
        private @Nullable Output<List<String>> sslCertificates;
        private @Nullable Output<String> sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetSslProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestId = defaults.requestId;
    	      this.service = defaults.service;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder proxyHeader(@Nullable Output<TargetSslProxyProxyHeader> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }
        public Builder proxyHeader(@Nullable TargetSslProxyProxyHeader proxyHeader) {
            this.proxyHeader = Output.ofNullable(proxyHeader);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public Builder sslCertificates(@Nullable Output<List<String>> sslCertificates) {
            this.sslCertificates = sslCertificates;
            return this;
        }
        public Builder sslCertificates(@Nullable List<String> sslCertificates) {
            this.sslCertificates = Output.ofNullable(sslCertificates);
            return this;
        }
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }
        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Output.ofNullable(sslPolicy);
            return this;
        }        public TargetSslProxyArgs build() {
            return new TargetSslProxyArgs(description, name, project, proxyHeader, requestId, service, sslCertificates, sslPolicy);
        }
    }
}
