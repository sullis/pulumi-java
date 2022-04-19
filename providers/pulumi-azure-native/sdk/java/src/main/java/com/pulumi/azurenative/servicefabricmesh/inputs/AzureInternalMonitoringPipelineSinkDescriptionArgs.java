// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Diagnostics settings for Geneva.
 * 
 */
public final class AzureInternalMonitoringPipelineSinkDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureInternalMonitoringPipelineSinkDescriptionArgs Empty = new AzureInternalMonitoringPipelineSinkDescriptionArgs();

    /**
     * Azure Internal monitoring pipeline account.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * Azure Internal monitoring pipeline autokey associated with the certificate.
     * 
     */
    @Import(name="autoKeyConfigUrl")
      private final @Nullable Output<String> autoKeyConfigUrl;

    public Output<String> autoKeyConfigUrl() {
        return this.autoKeyConfigUrl == null ? Codegen.empty() : this.autoKeyConfigUrl;
    }

    /**
     * A description of the sink.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Azure Internal monitoring agent fluentd configuration.
     * 
     */
    @Import(name="fluentdConfigUrl")
      private final @Nullable Output<Object> fluentdConfigUrl;

    public Output<Object> fluentdConfigUrl() {
        return this.fluentdConfigUrl == null ? Codegen.empty() : this.fluentdConfigUrl;
    }

    /**
     * The kind of DiagnosticsSink.
     * Expected value is 'AzureInternalMonitoringPipeline'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Azure Internal monitoring agent configuration.
     * 
     */
    @Import(name="maConfigUrl")
      private final @Nullable Output<String> maConfigUrl;

    public Output<String> maConfigUrl() {
        return this.maConfigUrl == null ? Codegen.empty() : this.maConfigUrl;
    }

    /**
     * Name of the sink. This value is referenced by DiagnosticsReferenceDescription
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Azure Internal monitoring pipeline account namespace.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    public AzureInternalMonitoringPipelineSinkDescriptionArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<String> autoKeyConfigUrl,
        @Nullable Output<String> description,
        @Nullable Output<Object> fluentdConfigUrl,
        Output<String> kind,
        @Nullable Output<String> maConfigUrl,
        @Nullable Output<String> name,
        @Nullable Output<String> namespace) {
        this.accountName = accountName;
        this.autoKeyConfigUrl = autoKeyConfigUrl;
        this.description = description;
        this.fluentdConfigUrl = fluentdConfigUrl;
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.maConfigUrl = maConfigUrl;
        this.name = name;
        this.namespace = namespace;
    }

    private AzureInternalMonitoringPipelineSinkDescriptionArgs() {
        this.accountName = Codegen.empty();
        this.autoKeyConfigUrl = Codegen.empty();
        this.description = Codegen.empty();
        this.fluentdConfigUrl = Codegen.empty();
        this.kind = Codegen.empty();
        this.maConfigUrl = Codegen.empty();
        this.name = Codegen.empty();
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureInternalMonitoringPipelineSinkDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<String> autoKeyConfigUrl;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> fluentdConfigUrl;
        private Output<String> kind;
        private @Nullable Output<String> maConfigUrl;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureInternalMonitoringPipelineSinkDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.autoKeyConfigUrl = defaults.autoKeyConfigUrl;
    	      this.description = defaults.description;
    	      this.fluentdConfigUrl = defaults.fluentdConfigUrl;
    	      this.kind = defaults.kind;
    	      this.maConfigUrl = defaults.maConfigUrl;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder autoKeyConfigUrl(@Nullable Output<String> autoKeyConfigUrl) {
            this.autoKeyConfigUrl = autoKeyConfigUrl;
            return this;
        }
        public Builder autoKeyConfigUrl(@Nullable String autoKeyConfigUrl) {
            this.autoKeyConfigUrl = Codegen.ofNullable(autoKeyConfigUrl);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fluentdConfigUrl(@Nullable Output<Object> fluentdConfigUrl) {
            this.fluentdConfigUrl = fluentdConfigUrl;
            return this;
        }
        public Builder fluentdConfigUrl(@Nullable Object fluentdConfigUrl) {
            this.fluentdConfigUrl = Codegen.ofNullable(fluentdConfigUrl);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder maConfigUrl(@Nullable Output<String> maConfigUrl) {
            this.maConfigUrl = maConfigUrl;
            return this;
        }
        public Builder maConfigUrl(@Nullable String maConfigUrl) {
            this.maConfigUrl = Codegen.ofNullable(maConfigUrl);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }        public AzureInternalMonitoringPipelineSinkDescriptionArgs build() {
            return new AzureInternalMonitoringPipelineSinkDescriptionArgs(accountName, autoKeyConfigUrl, description, fluentdConfigUrl, kind, maConfigUrl, name, namespace);
        }
    }
}
