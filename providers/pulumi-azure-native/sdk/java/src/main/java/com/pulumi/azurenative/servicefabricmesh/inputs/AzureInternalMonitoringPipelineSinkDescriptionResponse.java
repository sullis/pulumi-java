// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Diagnostics settings for Geneva.
 * 
 */
public final class AzureInternalMonitoringPipelineSinkDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureInternalMonitoringPipelineSinkDescriptionResponse Empty = new AzureInternalMonitoringPipelineSinkDescriptionResponse();

    /**
     * Azure Internal monitoring pipeline account.
     * 
     */
    @Import(name="accountName")
    private @Nullable String accountName;

    /**
     * @return Azure Internal monitoring pipeline account.
     * 
     */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * Azure Internal monitoring pipeline autokey associated with the certificate.
     * 
     */
    @Import(name="autoKeyConfigUrl")
    private @Nullable String autoKeyConfigUrl;

    /**
     * @return Azure Internal monitoring pipeline autokey associated with the certificate.
     * 
     */
    public Optional<String> autoKeyConfigUrl() {
        return Optional.ofNullable(this.autoKeyConfigUrl);
    }

    /**
     * A description of the sink.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return A description of the sink.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Azure Internal monitoring agent fluentd configuration.
     * 
     */
    @Import(name="fluentdConfigUrl")
    private @Nullable Object fluentdConfigUrl;

    /**
     * @return Azure Internal monitoring agent fluentd configuration.
     * 
     */
    public Optional<Object> fluentdConfigUrl() {
        return Optional.ofNullable(this.fluentdConfigUrl);
    }

    /**
     * The kind of DiagnosticsSink.
     * Expected value is &#39;AzureInternalMonitoringPipeline&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return The kind of DiagnosticsSink.
     * Expected value is &#39;AzureInternalMonitoringPipeline&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Azure Internal monitoring agent configuration.
     * 
     */
    @Import(name="maConfigUrl")
    private @Nullable String maConfigUrl;

    /**
     * @return Azure Internal monitoring agent configuration.
     * 
     */
    public Optional<String> maConfigUrl() {
        return Optional.ofNullable(this.maConfigUrl);
    }

    /**
     * Name of the sink. This value is referenced by DiagnosticsReferenceDescription
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the sink. This value is referenced by DiagnosticsReferenceDescription
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Azure Internal monitoring pipeline account namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return Azure Internal monitoring pipeline account namespace.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private AzureInternalMonitoringPipelineSinkDescriptionResponse() {}

    private AzureInternalMonitoringPipelineSinkDescriptionResponse(AzureInternalMonitoringPipelineSinkDescriptionResponse $) {
        this.accountName = $.accountName;
        this.autoKeyConfigUrl = $.autoKeyConfigUrl;
        this.description = $.description;
        this.fluentdConfigUrl = $.fluentdConfigUrl;
        this.kind = $.kind;
        this.maConfigUrl = $.maConfigUrl;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureInternalMonitoringPipelineSinkDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureInternalMonitoringPipelineSinkDescriptionResponse $;

        public Builder() {
            $ = new AzureInternalMonitoringPipelineSinkDescriptionResponse();
        }

        public Builder(AzureInternalMonitoringPipelineSinkDescriptionResponse defaults) {
            $ = new AzureInternalMonitoringPipelineSinkDescriptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Azure Internal monitoring pipeline account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param autoKeyConfigUrl Azure Internal monitoring pipeline autokey associated with the certificate.
         * 
         * @return builder
         * 
         */
        public Builder autoKeyConfigUrl(@Nullable String autoKeyConfigUrl) {
            $.autoKeyConfigUrl = autoKeyConfigUrl;
            return this;
        }

        /**
         * @param description A description of the sink.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param fluentdConfigUrl Azure Internal monitoring agent fluentd configuration.
         * 
         * @return builder
         * 
         */
        public Builder fluentdConfigUrl(@Nullable Object fluentdConfigUrl) {
            $.fluentdConfigUrl = fluentdConfigUrl;
            return this;
        }

        /**
         * @param kind The kind of DiagnosticsSink.
         * Expected value is &#39;AzureInternalMonitoringPipeline&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param maConfigUrl Azure Internal monitoring agent configuration.
         * 
         * @return builder
         * 
         */
        public Builder maConfigUrl(@Nullable String maConfigUrl) {
            $.maConfigUrl = maConfigUrl;
            return this;
        }

        /**
         * @param name Name of the sink. This value is referenced by DiagnosticsReferenceDescription
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespace Azure Internal monitoring pipeline account namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        public AzureInternalMonitoringPipelineSinkDescriptionResponse build() {
            $.kind = Codegen.stringProp("kind").arg($.kind).require();
            return $;
        }
    }

}
