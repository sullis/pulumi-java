// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStateMachinePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStateMachinePlainArgs Empty = new GetStateMachinePlainArgs();

    /**
     * The friendly name of the state machine to match.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The friendly name of the state machine to match.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetStateMachinePlainArgs() {}

    private GetStateMachinePlainArgs(GetStateMachinePlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStateMachinePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStateMachinePlainArgs $;

        public Builder() {
            $ = new GetStateMachinePlainArgs();
        }

        public Builder(GetStateMachinePlainArgs defaults) {
            $ = new GetStateMachinePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The friendly name of the state machine to match.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetStateMachinePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
