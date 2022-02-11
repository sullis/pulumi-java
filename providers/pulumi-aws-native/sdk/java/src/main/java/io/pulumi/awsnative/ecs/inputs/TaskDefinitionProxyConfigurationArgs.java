// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.TaskDefinitionKeyValuePairArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionProxyConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionProxyConfigurationArgs Empty = new TaskDefinitionProxyConfigurationArgs();

    @InputImport(name="containerName", required=true)
    private final Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName;
    }

    @InputImport(name="proxyConfigurationProperties")
    private final @Nullable Input<List<TaskDefinitionKeyValuePairArgs>> proxyConfigurationProperties;

    public Input<List<TaskDefinitionKeyValuePairArgs>> getProxyConfigurationProperties() {
        return this.proxyConfigurationProperties == null ? Input.empty() : this.proxyConfigurationProperties;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public TaskDefinitionProxyConfigurationArgs(
        Input<String> containerName,
        @Nullable Input<List<TaskDefinitionKeyValuePairArgs>> proxyConfigurationProperties,
        @Nullable Input<String> type) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.proxyConfigurationProperties = proxyConfigurationProperties;
        this.type = type;
    }

    private TaskDefinitionProxyConfigurationArgs() {
        this.containerName = Input.empty();
        this.proxyConfigurationProperties = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionProxyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> containerName;
        private @Nullable Input<List<TaskDefinitionKeyValuePairArgs>> proxyConfigurationProperties;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionProxyConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.proxyConfigurationProperties = defaults.proxyConfigurationProperties;
    	      this.type = defaults.type;
        }

        public Builder setContainerName(Input<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Input.of(Objects.requireNonNull(containerName));
            return this;
        }

        public Builder setProxyConfigurationProperties(@Nullable Input<List<TaskDefinitionKeyValuePairArgs>> proxyConfigurationProperties) {
            this.proxyConfigurationProperties = proxyConfigurationProperties;
            return this;
        }

        public Builder setProxyConfigurationProperties(@Nullable List<TaskDefinitionKeyValuePairArgs> proxyConfigurationProperties) {
            this.proxyConfigurationProperties = Input.ofNullable(proxyConfigurationProperties);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public TaskDefinitionProxyConfigurationArgs build() {
            return new TaskDefinitionProxyConfigurationArgs(containerName, proxyConfigurationProperties, type);
        }
    }
}
