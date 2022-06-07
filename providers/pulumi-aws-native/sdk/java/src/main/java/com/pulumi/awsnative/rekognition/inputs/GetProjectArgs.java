// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rekognition.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    @Import(name="projectName", required=true)
    private Output<String> projectName;

    public Output<String> projectName() {
        return this.projectName;
    }

    private GetProjectArgs() {}

    private GetProjectArgs(GetProjectArgs $) {
        this.projectName = $.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectArgs $;

        public Builder() {
            $ = new GetProjectArgs();
        }

        public Builder(GetProjectArgs defaults) {
            $ = new GetProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        public GetProjectArgs build() {
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            return $;
        }
    }

}
