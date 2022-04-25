// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPromptResult {
    /**
     * @return The Amazon Resource Name (ARN) of the Prompt.
     * 
     */
    private final String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceId;
    private final String name;
    /**
     * @return The identifier for the prompt.
     * 
     */
    private final String promptId;

    @CustomType.Constructor
    private GetPromptResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("promptId") String promptId) {
        this.arn = arn;
        this.id = id;
        this.instanceId = instanceId;
        this.name = name;
        this.promptId = promptId;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Prompt.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The identifier for the prompt.
     * 
     */
    public String promptId() {
        return this.promptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPromptResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String instanceId;
        private String name;
        private String promptId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPromptResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.promptId = defaults.promptId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder promptId(String promptId) {
            this.promptId = Objects.requireNonNull(promptId);
            return this;
        }        public GetPromptResult build() {
            return new GetPromptResult(arn, id, instanceId, name, promptId);
        }
    }
}
