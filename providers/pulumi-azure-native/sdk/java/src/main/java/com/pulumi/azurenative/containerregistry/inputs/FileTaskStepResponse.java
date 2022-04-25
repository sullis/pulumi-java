// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.BaseImageDependencyResponse;
import com.pulumi.azurenative.containerregistry.inputs.SetValueResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a task step.
 * 
 */
public final class FileTaskStepResponse extends com.pulumi.resources.InvokeArgs {

    public static final FileTaskStepResponse Empty = new FileTaskStepResponse();

    /**
     * List of base image dependencies for a step.
     * 
     */
    @Import(name="baseImageDependencies", required=true)
    private List<BaseImageDependencyResponse> baseImageDependencies;

    /**
     * @return List of base image dependencies for a step.
     * 
     */
    public List<BaseImageDependencyResponse> baseImageDependencies() {
        return this.baseImageDependencies;
    }

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @Import(name="contextAccessToken")
    private @Nullable String contextAccessToken;

    /**
     * @return The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    public Optional<String> contextAccessToken() {
        return Optional.ofNullable(this.contextAccessToken);
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @Import(name="contextPath")
    private @Nullable String contextPath;

    /**
     * @return The URL(absolute or relative) of the source context for the task step.
     * 
     */
    public Optional<String> contextPath() {
        return Optional.ofNullable(this.contextPath);
    }

    /**
     * The task template/definition file path relative to the source context.
     * 
     */
    @Import(name="taskFilePath", required=true)
    private String taskFilePath;

    /**
     * @return The task template/definition file path relative to the source context.
     * 
     */
    public String taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * The type of the step.
     * Expected value is &#39;FileTask&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the step.
     * Expected value is &#39;FileTask&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
    private @Nullable List<SetValueResponse> values;

    /**
     * @return The collection of overridable values that can be passed when running a task.
     * 
     */
    public Optional<List<SetValueResponse>> values() {
        return Optional.ofNullable(this.values);
    }

    /**
     * The task values/parameters file path relative to the source context.
     * 
     */
    @Import(name="valuesFilePath")
    private @Nullable String valuesFilePath;

    /**
     * @return The task values/parameters file path relative to the source context.
     * 
     */
    public Optional<String> valuesFilePath() {
        return Optional.ofNullable(this.valuesFilePath);
    }

    private FileTaskStepResponse() {}

    private FileTaskStepResponse(FileTaskStepResponse $) {
        this.baseImageDependencies = $.baseImageDependencies;
        this.contextAccessToken = $.contextAccessToken;
        this.contextPath = $.contextPath;
        this.taskFilePath = $.taskFilePath;
        this.type = $.type;
        this.values = $.values;
        this.valuesFilePath = $.valuesFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileTaskStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileTaskStepResponse $;

        public Builder() {
            $ = new FileTaskStepResponse();
        }

        public Builder(FileTaskStepResponse defaults) {
            $ = new FileTaskStepResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseImageDependencies List of base image dependencies for a step.
         * 
         * @return builder
         * 
         */
        public Builder baseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            $.baseImageDependencies = baseImageDependencies;
            return this;
        }

        /**
         * @param baseImageDependencies List of base image dependencies for a step.
         * 
         * @return builder
         * 
         */
        public Builder baseImageDependencies(BaseImageDependencyResponse... baseImageDependencies) {
            return baseImageDependencies(List.of(baseImageDependencies));
        }

        /**
         * @param contextAccessToken The token (git PAT or SAS token of storage account blob) associated with the context for a step.
         * 
         * @return builder
         * 
         */
        public Builder contextAccessToken(@Nullable String contextAccessToken) {
            $.contextAccessToken = contextAccessToken;
            return this;
        }

        /**
         * @param contextPath The URL(absolute or relative) of the source context for the task step.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(@Nullable String contextPath) {
            $.contextPath = contextPath;
            return this;
        }

        /**
         * @param taskFilePath The task template/definition file path relative to the source context.
         * 
         * @return builder
         * 
         */
        public Builder taskFilePath(String taskFilePath) {
            $.taskFilePath = taskFilePath;
            return this;
        }

        /**
         * @param type The type of the step.
         * Expected value is &#39;FileTask&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable List<SetValueResponse> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The collection of overridable values that can be passed when running a task.
         * 
         * @return builder
         * 
         */
        public Builder values(SetValueResponse... values) {
            return values(List.of(values));
        }

        /**
         * @param valuesFilePath The task values/parameters file path relative to the source context.
         * 
         * @return builder
         * 
         */
        public Builder valuesFilePath(@Nullable String valuesFilePath) {
            $.valuesFilePath = valuesFilePath;
            return this;
        }

        public FileTaskStepResponse build() {
            $.baseImageDependencies = Objects.requireNonNull($.baseImageDependencies, "expected parameter 'baseImageDependencies' to be non-null");
            $.taskFilePath = Objects.requireNonNull($.taskFilePath, "expected parameter 'taskFilePath' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
