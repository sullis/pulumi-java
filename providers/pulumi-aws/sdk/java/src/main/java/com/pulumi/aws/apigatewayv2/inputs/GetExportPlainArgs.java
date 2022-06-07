// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExportPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExportPlainArgs Empty = new GetExportPlainArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
    private String apiId;

    /**
     * @return The API identifier.
     * 
     */
    public String apiId() {
        return this.apiId;
    }

    /**
     * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is `1.0`.
     * 
     */
    @Import(name="exportVersion")
    private @Nullable String exportVersion;

    /**
     * @return The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is `1.0`.
     * 
     */
    public Optional<String> exportVersion() {
        return Optional.ofNullable(this.exportVersion);
    }

    /**
     * Specifies whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
     * 
     */
    @Import(name="includeExtensions")
    private @Nullable Boolean includeExtensions;

    /**
     * @return Specifies whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
     * 
     */
    public Optional<Boolean> includeExtensions() {
        return Optional.ofNullable(this.includeExtensions);
    }

    /**
     * The output type of the exported definition file. Valid values are `JSON` and `YAML`.
     * 
     */
    @Import(name="outputType", required=true)
    private String outputType;

    /**
     * @return The output type of the exported definition file. Valid values are `JSON` and `YAML`.
     * 
     */
    public String outputType() {
        return this.outputType;
    }

    /**
     * The version of the API specification to use. `OAS30`, for OpenAPI 3.0, is the only supported value.
     * 
     */
    @Import(name="specification", required=true)
    private String specification;

    /**
     * @return The version of the API specification to use. `OAS30`, for OpenAPI 3.0, is the only supported value.
     * 
     */
    public String specification() {
        return this.specification;
    }

    /**
     * The name of the API stage to export. If you don&#39;t specify this property, a representation of the latest API configuration is exported.
     * 
     */
    @Import(name="stageName")
    private @Nullable String stageName;

    /**
     * @return The name of the API stage to export. If you don&#39;t specify this property, a representation of the latest API configuration is exported.
     * 
     */
    public Optional<String> stageName() {
        return Optional.ofNullable(this.stageName);
    }

    private GetExportPlainArgs() {}

    private GetExportPlainArgs(GetExportPlainArgs $) {
        this.apiId = $.apiId;
        this.exportVersion = $.exportVersion;
        this.includeExtensions = $.includeExtensions;
        this.outputType = $.outputType;
        this.specification = $.specification;
        this.stageName = $.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExportPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExportPlainArgs $;

        public Builder() {
            $ = new GetExportPlainArgs();
        }

        public Builder(GetExportPlainArgs defaults) {
            $ = new GetExportPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param exportVersion The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is `1.0`.
         * 
         * @return builder
         * 
         */
        public Builder exportVersion(@Nullable String exportVersion) {
            $.exportVersion = exportVersion;
            return this;
        }

        /**
         * @param includeExtensions Specifies whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
         * 
         * @return builder
         * 
         */
        public Builder includeExtensions(@Nullable Boolean includeExtensions) {
            $.includeExtensions = includeExtensions;
            return this;
        }

        /**
         * @param outputType The output type of the exported definition file. Valid values are `JSON` and `YAML`.
         * 
         * @return builder
         * 
         */
        public Builder outputType(String outputType) {
            $.outputType = outputType;
            return this;
        }

        /**
         * @param specification The version of the API specification to use. `OAS30`, for OpenAPI 3.0, is the only supported value.
         * 
         * @return builder
         * 
         */
        public Builder specification(String specification) {
            $.specification = specification;
            return this;
        }

        /**
         * @param stageName The name of the API stage to export. If you don&#39;t specify this property, a representation of the latest API configuration is exported.
         * 
         * @return builder
         * 
         */
        public Builder stageName(@Nullable String stageName) {
            $.stageName = stageName;
            return this;
        }

        public GetExportPlainArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.outputType = Objects.requireNonNull($.outputType, "expected parameter 'outputType' to be non-null");
            $.specification = Objects.requireNonNull($.specification, "expected parameter 'specification' to be non-null");
            return $;
        }
    }

}
