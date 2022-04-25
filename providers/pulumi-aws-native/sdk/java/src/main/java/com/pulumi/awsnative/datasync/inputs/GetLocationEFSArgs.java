// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationEFSArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationEFSArgs Empty = new GetLocationEFSArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    @Import(name="locationArn", required=true)
    private String locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    public String locationArn() {
        return this.locationArn;
    }

    private GetLocationEFSArgs() {}

    private GetLocationEFSArgs(GetLocationEFSArgs $) {
        this.locationArn = $.locationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationEFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationEFSArgs $;

        public Builder() {
            $ = new GetLocationEFSArgs();
        }

        public Builder(GetLocationEFSArgs defaults) {
            $ = new GetLocationEFSArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        public GetLocationEFSArgs build() {
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            return $;
        }
    }

}
