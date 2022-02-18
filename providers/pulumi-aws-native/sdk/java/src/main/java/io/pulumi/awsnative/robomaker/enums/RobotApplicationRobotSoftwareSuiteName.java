// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The name of robot software suite.
     * 
     */
    @EnumType
    public enum RobotApplicationRobotSoftwareSuiteName {
        Ros("ROS"),
        Ros2("ROS2"),
        General("General");

        private final String value;

        RobotApplicationRobotSoftwareSuiteName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RobotApplicationRobotSoftwareSuiteName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
