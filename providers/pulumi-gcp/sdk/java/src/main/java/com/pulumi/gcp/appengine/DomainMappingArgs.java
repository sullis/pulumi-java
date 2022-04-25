// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.DomainMappingSslSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingArgs Empty = new DomainMappingArgs();

    /**
     * Relative name of the domain serving the application. Example: example.com.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return Relative name of the domain serving the application. Example: example.com.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * Whether the domain creation should override any existing mappings for this domain.
     * By default, overrides are rejected.
     * Default value is `STRICT`.
     * Possible values are `STRICT` and `OVERRIDE`.
     * 
     */
    @Import(name="overrideStrategy")
    private @Nullable Output<String> overrideStrategy;

    /**
     * @return Whether the domain creation should override any existing mappings for this domain.
     * By default, overrides are rejected.
     * Default value is `STRICT`.
     * Possible values are `STRICT` and `OVERRIDE`.
     * 
     */
    public Optional<Output<String>> overrideStrategy() {
        return Optional.ofNullable(this.overrideStrategy);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * Structure is documented below.
     * 
     */
    @Import(name="sslSettings")
    private @Nullable Output<DomainMappingSslSettingsArgs> sslSettings;

    /**
     * @return SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DomainMappingSslSettingsArgs>> sslSettings() {
        return Optional.ofNullable(this.sslSettings);
    }

    private DomainMappingArgs() {}

    private DomainMappingArgs(DomainMappingArgs $) {
        this.domainName = $.domainName;
        this.overrideStrategy = $.overrideStrategy;
        this.project = $.project;
        this.sslSettings = $.sslSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingArgs $;

        public Builder() {
            $ = new DomainMappingArgs();
        }

        public Builder(DomainMappingArgs defaults) {
            $ = new DomainMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName Relative name of the domain serving the application. Example: example.com.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Relative name of the domain serving the application. Example: example.com.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param overrideStrategy Whether the domain creation should override any existing mappings for this domain.
         * By default, overrides are rejected.
         * Default value is `STRICT`.
         * Possible values are `STRICT` and `OVERRIDE`.
         * 
         * @return builder
         * 
         */
        public Builder overrideStrategy(@Nullable Output<String> overrideStrategy) {
            $.overrideStrategy = overrideStrategy;
            return this;
        }

        /**
         * @param overrideStrategy Whether the domain creation should override any existing mappings for this domain.
         * By default, overrides are rejected.
         * Default value is `STRICT`.
         * Possible values are `STRICT` and `OVERRIDE`.
         * 
         * @return builder
         * 
         */
        public Builder overrideStrategy(String overrideStrategy) {
            return overrideStrategy(Output.of(overrideStrategy));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param sslSettings SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sslSettings(@Nullable Output<DomainMappingSslSettingsArgs> sslSettings) {
            $.sslSettings = sslSettings;
            return this;
        }

        /**
         * @param sslSettings SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sslSettings(DomainMappingSslSettingsArgs sslSettings) {
            return sslSettings(Output.of(sslSettings));
        }

        public DomainMappingArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
