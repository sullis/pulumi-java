// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.SsisParameterResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis Package.
 * 
 */
public final class SsisPackageResponse extends com.pulumi.resources.InvokeArgs {

    public static final SsisPackageResponse Empty = new SsisPackageResponse();

    /**
     * Metadata description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Metadata description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Folder id which contains package.
     * 
     */
    @Import(name="folderId")
    private @Nullable Double folderId;

    /**
     * @return Folder id which contains package.
     * 
     */
    public Optional<Double> folderId() {
        return Optional.ofNullable(this.folderId);
    }

    /**
     * Metadata id.
     * 
     */
    @Import(name="id")
    private @Nullable Double id;

    /**
     * @return Metadata id.
     * 
     */
    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Metadata name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Metadata name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Parameters in package
     * 
     */
    @Import(name="parameters")
    private @Nullable List<SsisParameterResponse> parameters;

    /**
     * @return Parameters in package
     * 
     */
    public Optional<List<SsisParameterResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Project id which contains package.
     * 
     */
    @Import(name="projectId")
    private @Nullable Double projectId;

    /**
     * @return Project id which contains package.
     * 
     */
    public Optional<Double> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Project version which contains package.
     * 
     */
    @Import(name="projectVersion")
    private @Nullable Double projectVersion;

    /**
     * @return Project version which contains package.
     * 
     */
    public Optional<Double> projectVersion() {
        return Optional.ofNullable(this.projectVersion);
    }

    /**
     * The type of SSIS object metadata.
     * Expected value is &#39;Package&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of SSIS object metadata.
     * Expected value is &#39;Package&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private SsisPackageResponse() {}

    private SsisPackageResponse(SsisPackageResponse $) {
        this.description = $.description;
        this.folderId = $.folderId;
        this.id = $.id;
        this.name = $.name;
        this.parameters = $.parameters;
        this.projectId = $.projectId;
        this.projectVersion = $.projectVersion;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsisPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsisPackageResponse $;

        public Builder() {
            $ = new SsisPackageResponse();
        }

        public Builder(SsisPackageResponse defaults) {
            $ = new SsisPackageResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Metadata description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param folderId Folder id which contains package.
         * 
         * @return builder
         * 
         */
        public Builder folderId(@Nullable Double folderId) {
            $.folderId = folderId;
            return this;
        }

        /**
         * @param id Metadata id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Double id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Metadata name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param parameters Parameters in package
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable List<SsisParameterResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters in package
         * 
         * @return builder
         * 
         */
        public Builder parameters(SsisParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param projectId Project id which contains package.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Double projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectVersion Project version which contains package.
         * 
         * @return builder
         * 
         */
        public Builder projectVersion(@Nullable Double projectVersion) {
            $.projectVersion = projectVersion;
            return this;
        }

        /**
         * @param type The type of SSIS object metadata.
         * Expected value is &#39;Package&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SsisPackageResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
