// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotebookInstanceLifecycleConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotebookInstanceLifecycleConfigurationArgs Empty = new NotebookInstanceLifecycleConfigurationArgs();

    /**
     * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
     * 
     */
    @Import(name="onCreate")
    private @Nullable Output<String> onCreate;

    /**
     * @return A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
     * 
     */
    public Optional<Output<String>> onCreate() {
        return Optional.ofNullable(this.onCreate);
    }

    /**
     * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it&#39;s created.
     * 
     */
    @Import(name="onStart")
    private @Nullable Output<String> onStart;

    /**
     * @return A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it&#39;s created.
     * 
     */
    public Optional<Output<String>> onStart() {
        return Optional.ofNullable(this.onStart);
    }

    private NotebookInstanceLifecycleConfigurationArgs() {}

    private NotebookInstanceLifecycleConfigurationArgs(NotebookInstanceLifecycleConfigurationArgs $) {
        this.name = $.name;
        this.onCreate = $.onCreate;
        this.onStart = $.onStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotebookInstanceLifecycleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotebookInstanceLifecycleConfigurationArgs $;

        public Builder() {
            $ = new NotebookInstanceLifecycleConfigurationArgs();
        }

        public Builder(NotebookInstanceLifecycleConfigurationArgs defaults) {
            $ = new NotebookInstanceLifecycleConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onCreate A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
         * 
         * @return builder
         * 
         */
        public Builder onCreate(@Nullable Output<String> onCreate) {
            $.onCreate = onCreate;
            return this;
        }

        /**
         * @param onCreate A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
         * 
         * @return builder
         * 
         */
        public Builder onCreate(String onCreate) {
            return onCreate(Output.of(onCreate));
        }

        /**
         * @param onStart A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it&#39;s created.
         * 
         * @return builder
         * 
         */
        public Builder onStart(@Nullable Output<String> onStart) {
            $.onStart = onStart;
            return this;
        }

        /**
         * @param onStart A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it&#39;s created.
         * 
         * @return builder
         * 
         */
        public Builder onStart(String onStart) {
            return onStart(Output.of(onStart));
        }

        public NotebookInstanceLifecycleConfigurationArgs build() {
            return $;
        }
    }

}
